package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question10809 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var caseNum = br.readLine().toInt()
        var st: StringTokenizer
        for(idx in 0 until caseNum) {
            st = StringTokenizer(br.readLine(), " ")
            var count = st.nextToken().toInt()
            var str = st.nextToken()
            for (c in str) {
                for (idx in 0 until count) {
                    bw.append(c)
                }
            }
            bw.newLine()
        }
        bw.flush()
    }

}