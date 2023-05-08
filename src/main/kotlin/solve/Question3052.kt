package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question3052 {
    constructor() {
        val divideNum = 42
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val inputCount = 10

        var divides = IntArray(divideNum)

        for (idx: Int in 0 until inputCount) {
            val input = br.readLine().toInt()
            divides[input%divideNum]++
        }


        var differCount = 0
        for (idx: Int in divides.indices) {
            if(divides[idx] != 0) differCount++
        }


        bw.append(differCount.toString())
        bw.flush()
    }
}