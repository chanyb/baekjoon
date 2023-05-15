package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2563
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val paperNum = br.readLine().toInt()
        val paperSize = 10
        var st : StringTokenizer
        var size = 0
        var getSmall = {a:Int , b:Int -> if(a<b) a else b}
        var getBig = {a:Int , b:Int -> if(a>b) a else b}
        var width = 0
        var height = 0

        var papers = Array(paperNum){ Paper() }
        for (idx in 0 until paperNum) {
            st = StringTokenizer(br.readLine())
            val left = st.nextToken().toInt()
            val bottom = st.nextToken().toInt()
            val right = left + paperSize
            val top = bottom + paperSize

            papers[idx] = Paper(top, bottom, left, right)
            size += 100
        }



        for (idx in 0 until paperNum) {
            // 기준이 되는 종이(idx)
            for (jdx in idx+1 until paperNum) {
                width = 0
                height = 0
                // 나머지 종이(jdx)
                if(papers[jdx].left in papers[idx].left .. papers[idx].right) {
                    // 기준 안에 왼 점이 있는 경우
                    width = getSmall(papers[idx].right, papers[jdx].right) - papers[jdx].left // right-left size

                } else {
                    // 기준 밖에 왼 점이 있는 경우, 기준 안에 오른 점이 있어야 함
                    if (papers[jdx].right in papers[idx].left .. papers[idx].right) {
                        width = papers[jdx].right - papers[idx].left
                    }
                }

                if(papers[jdx].top in papers[idx].bottom .. papers[idx].top) {
                    // 기준 안에 위 점이 있는 경우
                    height = papers[jdx].top - getBig(papers[idx].bottom, papers[jdx].bottom)
                } else {
                    // 기준 밖에 위 점이 있는 경우, 기준 안에 아래 점이 있어야 함
                    if (papers[jdx].bottom in papers[idx].bottom .. papers[idx].top) {
                        // 해당한다면
                        height = papers[idx].top - papers[jdx].bottom
                    }
                }

                size -= width*height
            }
        }
        bw.write(size.toString())
        bw.flush()
    }
}

class Paper {
    var top: Int
    var bottom: Int
    var left: Int
    var right: Int

    constructor() {
        this.top = 0
        this.bottom = 0
        this.left = 0
        this.right = 0
    }

    constructor(top: Int, bottom: Int, left: Int, right: Int) {
        this.top = top
        this.bottom = bottom
        this.left = left
        this.right = right
    }
}