/**
 * Created by awadawad on 5/05/2017.
 */
class ETL {
    companion object {
        fun transform(originalScoreMap: Map<Int, List<Char>>): Map<Char, Int> {
            val newScoreMap = mutableMapOf<Char, Int>()
            originalScoreMap.forEach {
                score, letters ->
                letters.forEach {
                    letter ->
                    newScoreMap.put(letter.toLowerCase(), score)
                }
            }
            return newScoreMap;
        }
    }
}