package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2908
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var st = StringTokenizer(br.readLine(), " ")

        val str1 = st.nextToken()
        val str2 = st.nextToken()

        val num1 = stringReverseInt(str1)
        val num2 = stringReverseInt(str2)

        print(if (num1 > num2) num1 else num2)


    }


    fun stringReverseInt(str: String) : Int {
        var sb = StringBuilder()

        for (character in str) {
            sb.insert(0, character)
        }

        return sb.toString().toInt()
    }
}