package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question11005 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val st = StringTokenizer(br.readLine())
        var decimal = st.nextToken().toInt()
        val notation = st.nextToken().toInt()
        var valueByNotation = StringBuilder()

        while(decimal > 0) {
            val value = decimal%notation

            if(value > 9) {
                valueByNotation.append((value.toChar().code + 55).toChar())
            }else {
                valueByNotation.append(value)
            }
            decimal /= notation
        }

        bw.write(valueByNotation.reversed().toString())
        bw.flush()
    }
}