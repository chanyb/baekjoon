package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question5622
{
    init {
        val dialSec = intArrayOf(2,3,4,5,6,7,8,9,10,11)
        val dial = arrayOf(null, "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", null)
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))

        val word = br.readLine()
        var sum = 0

        for (ch in word) {
            for(idx in dial.indices) {
                val res = dial[idx]?.indexOf(ch)
                if(res != null && res > -1 ) {
                    sum += dialSec[idx]
                    break
                }
            }
        }

        bw.write(sum.toString())
        bw.flush()

    }
}