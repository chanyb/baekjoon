package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question10988
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))

        bw.write(isPalindrome(br.readLine()))
        bw.flush()
    }

    fun isPalindrome(str: String) : String {
        for(idx in 0 until str.length/2) {
            if(str[idx] != str[str.length-idx-1]) return "0"
        }
        return "1"
    }
}