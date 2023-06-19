package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question1018
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val st = StringTokenizer(br.readLine(), " ")
        val N = st.nextToken().toInt()
        val M = st.nextToken().toInt()
        val board = Array(N) { Array(M) { 'A' } }
        val chessboard1 = arrayOf(
            arrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
            arrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
            arrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
            arrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
            arrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
            arrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
            arrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
            arrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B')
        )
        val chessboard2 = arrayOf(
            arrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
            arrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
            arrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
            arrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
            arrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
            arrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
            arrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
            arrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W')
        )

        for (i in 0 until N) {
            val str = br.readLine().toString()
            for (j in str.indices) {
                board[i][j] = str[j]
            }
        }

        /* 시작 */
        var originI:Int = 0
        var originJ:Int = 0
        var startI:Int = 0
        var startJ:Int = 0
        var b1diff:Int = 0
        var b2diff:Int = 0
        var min = 99999

        while(true) {
            if(originI+7 >= N) {
                break
            }

            while(true) {
                if(originJ+7 >= M) break

                for(i in originI..originI+7) {
                    for(j in originJ .. originJ+7) {
                        if(board[i][j] != chessboard1[i-originI][j-originJ]) b1diff++
                        if(board[i][j] != chessboard2[i-originI][j-originJ]) b2diff++
                    }
                }

                if(min > b1diff) min = b1diff
                if(min > b2diff) min = b2diff
                b1diff = 0
                b2diff = 0
                originJ++
            }
            originJ=0
            originI++
        }

        bw.write(min.toString())
        bw.flush()
    }
}