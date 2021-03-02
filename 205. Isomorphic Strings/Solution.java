{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean isIsomorphic(String s, String t) \{\
        HashMap<Character, Character> maps=new HashMap();\
        HashMap<Character, Character> mapt=new HashMap();\
        for(int i=0; i<s.length(); ++i)\
        \{\
            if(!maps.containsKey(s.charAt(i)))\
                maps.put(s.charAt(i), t.charAt(i));\
            else\
                if(t.charAt(i)!=maps.get(s.charAt(i)))\
                    return false;\
            if(!mapt.containsKey(t.charAt(i)))\
                mapt.put(t.charAt(i), s.charAt(i));\
            else\
                if(s.charAt(i)!=mapt.get(t.charAt(i)))\
                    return false;\
        \}   \
        return true;\
    \}\
\}}