{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
\
    int[] orig;\
    int[] shuf;\
    Random rand;\
    public Solution(int[] nums) \{\
        orig=nums;\
        shuf=new int[nums.length];\
        rand=new Random();\
    \}\
    \
    /** Resets the array to its original configuration and return it. */\
    public int[] reset() \{\
        return orig;\
    \}\
    \
    /** Returns a random shuffling of the array. */\
    public int[] shuffle() \{\
        for(int i=0; i<orig.length; ++i)\
            shuf[i]=Integer.MIN_VALUE;\
        for(int i=0; i<orig.length; ++i)\
        \{\
            int t=rand.nextInt(orig.length);\
            while(shuf[t]!=Integer.MIN_VALUE)\
                t=rand.nextInt(orig.length);\
            shuf[t]=orig[i];\
        \}\
        return shuf;\
    \}\
\}\
\
/**\
 * Your Solution object will be instantiated and called as such:\
 * Solution obj = new Solution(nums);\
 * int[] param_1 = obj.reset();\
 * int[] param_2 = obj.shuffle();\
 */}