package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question2292
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val num = br.readLine().toInt()
        var count = 1
        while (true) {
            var sum = 1
            for(idx in 1 until count) {
                sum += (count+idx)*2
            }
            if(num <= sum) {
                break
            }
            count++
        }
        bw.write(count.toString())
        bw.flush()
    }
}