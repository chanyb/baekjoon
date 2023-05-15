package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2563
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val paperNum = br.readLine().toInt()
        val paperSize = 10
        var st : StringTokenizer
        var map = Array(100){Array(100){0}}
        var size = 0

        for (idx in 0 until paperNum) {
            st = StringTokenizer(br.readLine())
            val left = st.nextToken().toInt()
            val bottom = st.nextToken().toInt()
            val right = left + paperSize
            val top = bottom + paperSize

            for(row in left until right) {
                for (column in bottom until top) {
                    if(map[row][column] == 0) {
                        map[row][column]++
                        size++
                    }

                }
            }
        }
        bw.write(size.toString())
        bw.flush()
    }
}