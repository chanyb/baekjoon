
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main(args: Array<String>) {
    var br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.`out`))
    var n: Int = 9
    var iarray: IntArray = IntArray(n)
    var max: Int = 0
    var max_idx: Int = 0

    for(idx: Int in 0 until n) {
        iarray.set(idx, br.readLine().toInt());
        if (max == 0 ) {
            max = iarray.get(0)
        }

        if (bIsBig(max, iarray.get(idx))) {
            max = iarray.get(idx)
            max_idx = idx
        }
    }


    bw.write(max.toString())
    bw.newLine()
    bw.write((max_idx+1).toString())
    bw.flush()
}

fun bIsBig(a: Int, b: Int) : Boolean {
    return a < b
}
