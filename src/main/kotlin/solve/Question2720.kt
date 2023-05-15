package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question2720 {
    constructor() {
        // Quarter = 25센트, Dime = 10센트, Nickel = 5센트, Penny = 1센트
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val quarter = 25
        val dime = 10
        val nickel = 5

        val case = br.readLine().toInt()

        for(idx in 0 until case) {
            if(idx != 0) bw.newLine()
            var cent = br.readLine().toInt()
            var quarterCount = cent/quarter
            var dimeCount = cent%quarter/dime
            var nickelCount = cent%quarter%dime/nickel
            var pennyCount = cent%quarter%dime%nickel
            bw.write("$quarterCount $dimeCount $nickelCount $pennyCount")
        }
        bw.flush()
    }
}