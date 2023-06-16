package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question8958 {
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val case = br.readLine().toInt()
        var totalScore = 0
        var score = 0

        for(i in 1..case) {
            val result = br.readLine().toString()
            for (question in result) {
                if(question == 'O') {
                    score++
                    totalScore += score
                }
                else if(question == 'X') score=0
            }

            bw.write(totalScore.toString()+"\n")
            totalScore=0
            score=0
        }

        bw.flush()
    }

}