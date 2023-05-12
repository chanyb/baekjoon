package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class Question2738
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var st = StringTokenizer(br.readLine(), " ")

        var rowNum = st.nextToken().toInt()
        var columnNum = st.nextToken().toInt()
        var matrix = IntArray(rowNum*columnNum){0}

        for (matrixIdx in 1 .. 2) {
            // matrix 수
            for (rowIdx in 0 until rowNum) {
                // row는 0부터 rowNum-1
                st = StringTokenizer(br.readLine())
                for(colIdx in 1 .. columnNum) {
                    //col은 1부터 (곱셈위해)
                    matrix[rowIdx*columnNum + colIdx -1] += st.nextToken().toInt()
                }
            }
        }


        // print
        var printNum = 0
        for (num in matrix) {
            if(printNum == columnNum) {
                bw.newLine()
                printNum=0
            }
            bw.write("$num ")
            printNum++
        }
        bw.flush()
    }
}