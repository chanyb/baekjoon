package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question10812
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var st = StringTokenizer(br.readLine(), " ")
        val bucketSize = st.nextToken().toInt()
        val loopSize = st.nextToken().toInt()
        var bucket = IntArray(bucketSize)

        for(idx in bucket.indices) bucket[idx] = idx+1
        for(idx in 1..loopSize) {
            st = StringTokenizer(br.readLine(), " ")
            val start = st.nextToken().toInt() - 1
            val end = st.nextToken().toInt() - 1
            val middle = st.nextToken().toInt() - 1
            var pre = IntArray(middle-start)
            var post = IntArray(end-middle+1)

            for (jdx in start until middle) {
                pre[jdx-start] = bucket[jdx]
            }

            for (jdx in middle .. end) {
                post[jdx-middle] = bucket[jdx]
            }

            var postIdx = 0
            var preIdx = 0
            for (jdx in bucket.indices) {
                if (jdx < start) {
                    continue
                }
                else if (jdx in start until start+post.size) {
                    bucket[jdx] = post[postIdx++]
                }
                else if (jdx in post.size until start+post.size+pre.size) {
                    bucket[jdx] = pre[preIdx++]
                }
                else {
                    continue
                }
            }

        }
        bucket.map { i:Int -> bw.write("$i ") }
        bw.flush()
    }
}