package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.StringTokenizer

class Question2501 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var st =  StringTokenizer(br.readLine())

        var linkedList = LinkedList<Int>()
        val n = st.nextToken().toInt()
        val k = st.nextToken().toInt()
        for(idx in 1..n) {
            if(n%idx == 0) {
                linkedList.add(idx)
            }
        }
        if(k-1>=linkedList.size) bw.write("0")
        else bw.write(linkedList.get(k-1).toString())
        bw.flush()

    }
}