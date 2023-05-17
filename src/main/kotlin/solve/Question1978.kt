package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question1978
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val case = br.readLine().toInt()
        val st = StringTokenizer(br.readLine(), " ")
        var count = 0
        for(idx in 0 until case) {
            val n = st.nextToken().toInt()
            if(n==1) continue
            var isPrimeNumber = true
            for(idx in 2 until n) {
                if(n%idx == 0) {
                    isPrimeNumber = false
                    break
                }
            }
            if(isPrimeNumber) {
                count++
            }
        }

        bw.write(count.toString())
        bw.flush()
    }
}