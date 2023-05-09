package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.DecimalFormat
import java.util.StringTokenizer

class Question1546 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var sb = StringBuilder()
        var maxScore: Float = 0f
        var sum: Float = 0f

        var subjectNum = br.readLine().toInt()
        var subjects = FloatArray(subjectNum)
        var st = StringTokenizer(br.readLine(), " ")

        for (idx: Int in 0 until subjectNum) {
            subjects[idx] = st.nextToken().toFloat();
            maxScore = max(maxScore, subjects[idx])
        }

        for (idx: Int in subjects.indices) {
            subjects[idx] = subjects[idx] / maxScore * 100
            sum += subjects[idx]
        }

        val decimalFormat = DecimalFormat("#.##########")
        bw.append(decimalFormat.format((sum.toFloat()/subjectNum)).toString())
        bw.flush()
    }

    fun max(i: Float, j:Float) : Float {
        if(i>j) return i
        return j
    }
}