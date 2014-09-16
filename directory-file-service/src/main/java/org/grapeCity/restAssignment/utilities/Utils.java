package org.grapeCity.restAssignment.utilities;

import java.util.Collection;
import java.util.Map;
/**
 * Utility Class.
 */
public class Utils {
    /**
     * Check null or blank.
     * @param objVal
     *            the objVal
     * @return true, if successful
     */
    public static boolean checkNullOrBlank(Object objVal) {
        if (objVal == null) {
            return true;
        } else {
            if (objVal instanceof String) {
                String strValue = (String) objVal;
                if ("".equalsIgnoreCase(strValue.trim())
                        || "null".equalsIgnoreCase(strValue)) {
                    return true;
                }
            } else if (objVal instanceof Integer) {
                Integer intValue = (Integer) objVal;
                if (intValue == 0) {
                    return true;
                }
            } else if (objVal instanceof Object[]) {
                Object[] objArr = (Object[]) objVal;
                if (objArr.length == 0) {
                    return true;
                }
            } else if (objVal instanceof Collection) {
                Collection < Object > col = (Collection < Object >) objVal;
                if (col.size() == 0) {
                    return true;
                }
            } else if (objVal instanceof Map) {
                Map < Object, Object > map = (Map < Object, Object >) objVal;
                if (map.size() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

   }
