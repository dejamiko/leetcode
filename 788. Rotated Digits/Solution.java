{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int rotatedDigits(int N) \{\
        HashMap<Character, Character> map=new HashMap<>();\
        map.put('0', '0');\
        map.put('1', '1');\
        map.put('2', '5');\
        map.put('5', '2');\
        map.put('6', '9');\
        map.put('8', '8');\
        map.put('9', '6');\
        int ans=0;\
        for(int i=0; i<=N; ++i)\
        \{\
            char[] t=String.valueOf(i).toCharArray();\
            boolean works=true;\
            for(int j=0; works && j<t.length; ++j)\
            \{\
                if(!map.containsKey(t[j]))\
                \{\
                    works=false;\
                    break;\
                \}\
                t[j]=map.get(t[j]);\
            \}\
            if(works)\
                if(Integer.parseInt(String.valueOf(t))!=i)\
                    ans++;\
        \}\
        return ans;\
    \}\
\}}