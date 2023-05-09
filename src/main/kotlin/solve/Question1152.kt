package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question1152
{
    init {
        val s=1000000; // 미리 준비해놓을 ByteArray Size
        val t=32.toByte() // ?
        val a=ByteArray(s) // ByteArray
        System.`in`.read(a,0,s) // a에 입력을 받는다.
        var p=-1;
        var c=0
        while(a[++p]>31.toByte()) {
            if(a[p]>t) {
                c++; break
            }
        }
        while(++p<s) {
            println(p)
            if(a[p]<t) break
            else if(a[p]==t) c++
        }
        print(if(a[p-1]==t)c-1 else c)


    }

}