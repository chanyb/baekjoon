package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question5086 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val sb = StringBuilder()
        var st: StringTokenizer

        while (true) {
            st = StringTokenizer(br.readLine())
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()

            if(a==0 && b==0) break
            sb.append(isDivisor(a, b))
            sb.append("\n")
        }

        bw.write(sb.toString().substring(0, sb.length-1))
        bw.flush()

    }

    fun isDivisor(a: Int, b: Int) : String {
        // a 가 b의 약수인지
        if(a > b) {
            return isMultiple(a,b)
        }
        if(a==0) return "neither"
        if(b%a == 0) return "factor"
        return "neither"
    }

    fun isMultiple(a: Int, b: Int) : String {
        // a가 b의 배수인지
        if(b==0) return "neither"

        if(a%b == 0) {
            return "multiple"
        }
        return "neither"
    }
}