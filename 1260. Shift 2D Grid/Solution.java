{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<List<Integer>> shiftGrid(int[][] grid, int k) \{\
        Deque<Integer> queue=new ArrayDeque();\
        for(int i=0; i<grid.length; ++i)\
            for(int j=0; j<grid[i].length; ++j)\
                queue.addLast(grid[i][j]);\
        k=k%(grid[0].length*grid.length);\
        for(int i=0; i<k; ++i)\
            queue.addFirst(queue.pollLast());\
        List<List<Integer>> ans=new ArrayList();\
        for(int i=0; i<grid.length; ++i)\
        \{\
            List<Integer> line=new ArrayList();\
            for(int j=0; j<grid[i].length; ++j)\
                line.add(queue.pollFirst());\
            ans.add(line);\
        \}\
        return ans;\
    \}\
\}}