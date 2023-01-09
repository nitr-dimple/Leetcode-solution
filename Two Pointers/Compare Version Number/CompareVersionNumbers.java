class Solution {
    public int compareVersion(String version1, String version2) {
        
        String split1[] = version1.split("\\.");
        String split2[] = version2.split("\\.");

        int n = split1.length < split2.length ? split1.length : split2.length;
        int i=0;

        for(i=0; i< n; i++){
            if(Integer.parseInt( split1[i]) > Integer.parseInt(split2[i]) )
                return 1;
            else if(Integer.parseInt( split1[i]) < Integer.parseInt(split2[i]) )
                return -1;
        }
        if(split1.length != n){
            for(; i< split1.length; i++){
                if(Integer.parseInt( split1[i]) != 0) return 1;
            }
        }

        if(split2.length != n){
            for(; i< split2.length; i++){
                if(Integer.parseInt( split2[i]) != 0) return -1;
            }
        }

        return 0;
    }
}