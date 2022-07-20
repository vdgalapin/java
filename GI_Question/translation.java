package GI_Question;

import java.util.HashMap;

class translation {
    
    static HashMap<String, String> HMT = new HashMap<String, String>();
    
    static void register(String key, String values) {
        HMT.put(key, values);
    }

    static String revision(String value) {
        String result = "";
        String bldString = "";
        boolean firstQuote = false;
        for(int x = 0; x < value.length(); x++) {
            String charc =  Character.toString(value.charAt(x));
            if(charc.equals("%")) {
                if(firstQuote) {
                    // Second Quote is found
                    firstQuote = false;
                } else {
                    // First Quote
                    firstQuote = true;
                    bldString = "";
                }

                // Find String after second quote
                if (!firstQuote) {
                    if(HMT.containsKey(bldString)) {
                        result += HMT.get(bldString);;
                    } else {

                    }
                }
            } else {

                if(firstQuote) {
                    bldString += charc;
                } else {
                    result += charc;
                }

            }
        }

        return result;
    }

}
