
package ru.smartsarov.rosreestr.json.object;

import java.io.Serializable;

public class Stat implements Serializable
{

    private final static long serialVersionUID = 2684548367315575087L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
