/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] ans = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            ans[j] = array[i];
            j++;
        }
        return ans;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (!array[left].equals(array[right])) return false;
            left++;
            right--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean letters[] = new boolean['z' + 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (Character.isLetter(array[i].charAt(j))) {
                    char cur = Character.toLowerCase(array[i].charAt(j));
                    letters[cur] = true;
                }
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (!letters[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) ans++;
        }
        return ans;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String ans[] = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                ans[j++] = array[i];
            }
        }
        return ans;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int size = 1;
        String prev = array[0];
        for (int i = 1; i < array.length; i++) {
            if (!prev.equals(array[i])) {
                prev = array[i];
                size++;
            }
        }
        String ans[] = new String[size];
        prev = array[0];
        ans[0] = prev;
        size = 1;
        for (int i = 1; i < array.length; i++) {
            if (!prev.equals(array[i])) {
                prev = array[i];
                ans[size++] = prev;
            }
        }
        return ans;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int size = 1;
        String prev = array[0];
        for (int i = 1; i < array.length; i++) {
            if (!prev.equals(array[i])) {
                prev = array[i];
                size++;
            }
        }
        String ans[] = new String[size];
        prev = array[0];
        ans[0] = prev;
        size = 0;
        for (int i = 1; i < array.length; i++) {
            if (!prev.equals(array[i])) {
                prev = array[i];
                ans[++size] = "" + prev;
            } else {
                ans[size] = ans[size] + prev;
            }
        }
        return ans;
    }


}
