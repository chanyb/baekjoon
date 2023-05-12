package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.DecimalFormat
import java.util.StringTokenizer

class Question25206
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val decimalFormat = DecimalFormat("#.####")
        var sumScore = 0f
        var sumSubjectValue = 0f
        for(idx in 0 until 20) {
            val st = StringTokenizer(br.readLine(), " ")
            st.nextToken()
            val subjectValue = st.nextToken().toFloat()
            val subjectGrade = st.nextToken().toString()
            val res = scoreOfGrade(subjectGrade)
            if (res.first) {
                // 계산
                sumScore += subjectValue * res.second
                sumSubjectValue += subjectValue
            } else {
                // 계산안함
            }
        }

        bw.write(decimalFormat.format((sumScore/sumSubjectValue)).toString())
        bw.flush()
    }

    fun scoreOfGrade(str: String) : Pair<Boolean, Float> {
        when (str) {
            "A+" -> return Pair(true, 4.5f)
            "A0" -> return Pair(true, 4.0f)
            "B+" -> return Pair(true, 3.5f)
            "B0" -> return Pair(true, 3.0f)
            "C+" -> return Pair(true, 2.5f)
            "C0" -> return Pair(true, 2.0f)
            "D+" -> return Pair(true, 1.5f)
            "D0" -> return Pair(true, 1.0f)
            "F" -> return Pair(true, 0.0f)
            "P" -> return Pair(false, 0.0f)
            else -> {
                println("출력 초과")
                return Pair(true, 0.0f)
            }
        }
    }
}