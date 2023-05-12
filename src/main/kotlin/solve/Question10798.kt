package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question10798 {
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val row = 5
        val column = 15
        var matrix = Array(row*column){""}

        for (idx in 1 .. row) {
            val line = br.readLine()
            for(jdx in line.indices) {
                matrix[jdx*row+idx-1] = line[jdx].toString()
            }
        }

        matrix.map { bw.write(it) }
        bw.flush()
    }
}