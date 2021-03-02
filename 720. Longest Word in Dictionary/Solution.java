{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String longestWord(String[] words) \{\
        Arrays.sort(words, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());\
        HashSet<String> set=new HashSet();\
        for(int i=0; i<words.length; ++i)\
            set.add(words[i]);\
        for(int i=0; i<words.length; ++i)\
        \{\
            String temp=words[i];\
            boolean works=true;\
            for(int j=1; works && j<=temp.length(); ++j)\
                if(!set.contains(temp.substring(0, j)))\
                    works=false;\
            if(works)\
                return temp;\
        \}\
        return "";\
    \}\
\}}