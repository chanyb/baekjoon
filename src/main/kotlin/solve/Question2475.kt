package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2475 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var st = StringTokenizer(br.readLine(), " ")
        var arr = IntArray(5)
        arr[0] = st.nextToken().toInt()
        arr[1] = st.nextToken().toInt()
        arr[2] = st.nextToken().toInt()
        arr[3] = st.nextToken().toInt()
        arr[4] = st.nextToken().toInt()
        bw.write(((arr[0]*arr[0] + arr[1]*arr[1] + arr[2]*arr[2] + arr[3]*arr[3] + arr[4]*arr[4])%10).toString())
        bw.flush()
    }
}