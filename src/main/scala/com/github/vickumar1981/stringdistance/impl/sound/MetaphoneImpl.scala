package com.github.vickumar1981.stringdistance.impl.sound

import com.github.vickumar1981.stringdistance.interfaces.sound.MetaphoneAlgo
import com.github.vickumar1981.stringdistance.interfaces.sound.CommonSoundAlgo._

trait MetaphoneImpl {
  private def compare(a: Array[Char], b: Array[Char]): Option[Boolean] =
    if (a.length == 0 || !isAlpha(a.head) || b.length == 0 || !isAlpha(b.head)) None
    else MetaphoneAlgo.compute(a).filter(_.length > 0).flatMap { mp1 =>
      MetaphoneAlgo.compute(b).filter(_.length > 0).map(mp1.sameElements(_))
    }

  protected def metaphone(s1: String, s2: String): Boolean =
    compare(s1.toCharArray, s2.toCharArray).getOrElse(false)
}
