{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int uniqueMorseRepresentations(String[] words) \{\
        if(words.length==0)\
            return 0;\
        String[] letters=\{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."\};\
        String[] answers=new String[words.length];\
        for(int i=0; i<words.length; ++i)\
        \{\
            answers[i]="";\
            for(int j=0; j<words[i].length(); ++j)\
                answers[i]=answers[i]+(letters[words[i].charAt(j)-'a']);\
        \}\
        Arrays.sort(answers);\
        ArrayList temp=new ArrayList();\
        temp.add(answers[0]);\
        for(int i=1; i<answers.length; ++i)\
            if(!temp.contains(answers[i]))\
                temp.add(answers[i]);\
        return temp.size();\
    \}\
\}}