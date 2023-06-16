package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question14215 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val st = StringTokenizer(br.readLine())
        val sb = StringBuilder()
        val arr = IntArray(3)
        arr[0] = st.nextToken().toInt()
        arr[1] = st.nextToken().toInt()
        arr[2] = st.nextToken().toInt()

        var max = arr[0]
        if(max < arr[1]) max = arr[1]
        if(max < arr[2]) max = arr[2]

        if( max >= (arr[0]+arr[1]+arr[2]-max)) sb.append((arr[0]+arr[1]+arr[2]-max) + ((arr[0]+arr[1]+arr[2]-max) - 1))
        else sb.append(arr[0]+arr[1]+arr[2])

        if(arr[0]==arr[1] && arr[0]==arr[2]) {
            sb.clear()
            sb.append(arr[0]*3)
        }
        bw.write(sb.toString())
        bw.flush()
    }
}