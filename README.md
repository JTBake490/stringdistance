# StringDistance

[![Build Status](https://api.travis-ci.org/vickumar1981/stringdistance.svg?branch=master)](https://travis-ci.org/vickumar1981/stringdistance/builds) [![Coverage](https://s3.amazonaws.com/assets.coveralls.io/badges/coveralls_100.png)](https://coveralls.io/github/vickumar1981/stringdistance) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A String distance library for Scala and Java that includes Levenshtein distance, Jaro distance, Jaro-Winkler distance, Dice coefficient, N-Gram similarity, and Hamming distance.

### Scala Usage

Example:
```
// Scala example
import com.github.vickumar1981.stringdistance.StringDistance

val jaro = StringDistance.jaro("MARTHA", "MARHTA")
val jaroWinkler = StringDistance.jaroWinkler("MARTHA", "MARHTA")
val hamming = StringDistance.hamming("MARTHA", "MARHTA")
val diceCoefficient = StringDistance.diceCoefficient("MARTHA", "MARHTA")
val diceCoefficientWeighted = StringDistance.diceCoefficient("MARTHA", "MARHTA", 0.2)
val levenshtein = StringDistance.levenshtein("MARTHA", "MARHTA")
val ngramSimilarity = StringDistance.ngram("karolin", "kathrin")
val bigramSimilarity = StringDistance.ngram("karolin", "kathrin", 2)
```

### Use with Implicits
  -  To use implicits and extend the String class:  `import com.github.vickumar1981.stringdistance.StringConverter._`

Example
```
// Scala example using implicits
import com.github.vickumar1981.stringdistance.StringConverter._

val jaro = "MARTHA".jaro("MARHTA")
val jaroWinkler = "MARTHA".jaroWinkler("MARHTA")
...

```

### Java Usage
  -  To use in Java:  `import com.github.vickumar1981.stringdistance.util.StringDistance`

Example
```
// Java example
import com.github.vickumar1981.stringdistance.util.StringDistance;

Double jaro = StringDistance.jaro("MARTHA", "MARHTA");
Double jaroWinkler = StringDistance.jaroWinkler("MARTHA", "MARHTA");
Integer hamming = StringDistance.hamming("MARTHA", "MARHTA");
Double diceCoefficient = StringDistance.diceCoefficient("MARTHA", "MARHTA");
Double diceCoefficientWeighted = StringDistance.diceCoefficient("MARTHA", "MARHTA", 0.2);
Integer levenshtein = StringDistance.levenshtein("MARTHA", "MARHTA");
Double ngramSimilarity = StringDistance.ngram("karolin", "kathrin");
Double bigramSimilarity = StringDistance.ngram("karolin", "kathrin", 2);
```

