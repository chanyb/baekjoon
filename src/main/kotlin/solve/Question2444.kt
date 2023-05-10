package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question2444
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var size = br.readLine().toInt()

        for (idx in 1 until size) {
            for(jdx in size-idx downTo 1) bw.append(" ")
            for(kdx in 0 until idx * 2 - 1) bw.append("*")
            bw.newLine()
        }
        for (idx in 1 until size*2) bw.append("*")
        bw.newLine()
        for (idx in size-1 downTo 1) {
            for(jdx in size-idx downTo 1) bw.append(" ")
            for(kdx in 0 until idx * 2 - 1) bw.append("*")
            bw.newLine()
        }

        bw.flush()

    }
}