package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question2903
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var points = 2
        val num = br.readLine().toInt()
        for(idx in 0 until num) {
            points = points * 2 - 1
        }
        bw.write((points*points).toString())
        bw.flush()
    }
}