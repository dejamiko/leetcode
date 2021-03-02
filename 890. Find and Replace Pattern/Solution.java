{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<String> findAndReplacePattern(String[] words, String pattern) \{\
        List<String> ans=new ArrayList();\
        for(int i=0; i<words.length; ++i)\
            if(works(words[i], pattern))\
                ans.add(words[i]);\
        return ans;\
    \}\
    \
    public boolean works(String word, String pattern)\
    \{\
        Map<Character, Character> map=new HashMap();\
        for(int i=0; i<word.length(); ++i)\
        \{\
            char w=word.charAt(i);\
            char p=pattern.charAt(i);\
            if(!map.containsKey(w))\
                map.put(w, p);\
            if(map.get(w)!=p)\
                return false;\
        \}\
        boolean[] seen=new boolean[26];\
        for(char p: map.values())\
        \{\
            if(seen[p-'a'])\
                return false;\
            seen[p-'a']=true;\
        \}\
        return true;\
    \}\
\}}