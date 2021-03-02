{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /*\
 * // This is the custom function interface.\
 * // You should not implement it, or speculate about its implementation\
 * class CustomFunction \{\
 *     // Returns f(x, y) for any given positive integers x and y.\
 *     // Note that f(x, y) is increasing with respect to both x and y.\
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)\
 *     public int f(int x, int y);\
 * \};\
 */\
\
class Solution \{\
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) \{\
        List<List<Integer>> ans=new ArrayList<List<Integer>>();\
        for(int x=1; x<=1000; ++x)\
        \{\
            if (customfunction.f(x, 1) > z)\
                break;\
    \
            int left=1, right=1000;\
            while(left<=right)\
            \{\
                int mid=(right-left)/2+left;\
                if(customfunction.f(x, mid)>z)\
                    right=mid-1;\
                else\
                \{\
                    if(customfunction.f(x, mid)<z)\
                        left=mid+1;\
                    else\
                    \{\
                        ans.add(Arrays.asList(x, mid));\
                        break;\
                    \}\
                \}\
                    \
            \}\
        \}\
        return ans;\
    \}\
\}}