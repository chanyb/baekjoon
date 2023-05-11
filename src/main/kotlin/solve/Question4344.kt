package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.DecimalFormat
import java.util.StringTokenizer

class Question4344 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val caseNum = br.readLine().toInt()

        for (idx in 0 until caseNum) {
            val st = StringTokenizer(br.readLine(), " ")
            val studentNum = st.nextToken().toInt()
            var scores = IntArray(studentNum)
            var sum = 0
            for (jdx in 1..studentNum) {
                scores[jdx-1] = st.nextToken().toInt()
                sum += scores[jdx-1]
            }

            var targetNum = 0
            for (jdx in 0 until studentNum) {
                if(scores[jdx] > sum/studentNum) targetNum++
            }
            val decimalFormat = DecimalFormat("0.000")
            bw.write(decimalFormat.format((targetNum.toFloat()/studentNum)*100) + "%")
            bw.newLine()
        }

        bw.flush()
    }

}