{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean wordPattern(String pattern, String s) \{\
        String[] t=s.split(" ");\
        HashMap<Character, String> map1=new HashMap();\
        HashMap<String, Character> map2=new HashMap();\
        if(pattern.length()!=t.length)\
            return false;\
        for(int i=0; i<pattern.length(); ++i)\
        \{\
            if(!map1.containsKey(pattern.charAt(i)))\
                map1.put(pattern.charAt(i), t[i]);\
            else\
                if(!map1.get(pattern.charAt(i)).equals(t[i]))\
                    return false;\
            \
            if(!map2.containsKey(t[i]))\
                map2.put(t[i], pattern.charAt(i));\
            else\
                if(!map2.get(t[i]).equals(pattern.charAt(i)))\
                    return false;\
        \}\
        return true;\
    \}\
\}}