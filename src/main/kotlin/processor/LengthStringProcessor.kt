package processor

class LengthStringProcessor : Processor {
    /**
     * Add an additional word to the original string depending on the string length:
     * 1. If the string length is in the range from 0 to 5, inclusively, add a 'short ' prefix to it.
     * 2. If the string length is in the range from 6 to 10, inclusively, add a 'medium ' prefix to it.
     * 3. If the string length is in the range from 11 to 20, inclusively, add a 'long ' prefix to it.
     * 4. Otherwise do not modify the string.
     * @param input original string
     * @return modified string depending on the string length
     */
    override fun process(input: String): String {
        return when(input.length) {
            in 0..5->"short $input"
            in 6..10->"medium $input"
            in 11..20->"long $input"
            else->input
        }
    }
}