{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class SubrectangleQueries \{\
    int[][] matrix;\
    public SubrectangleQueries(int[][] rectangle) \{\
        matrix=rectangle;\
    \}\
    \
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) \{\
        for(int i=row1; i<=row2; ++i)\
            for(int j=col1; j<=col2; ++j)\
                matrix[i][j]=newValue;\
    \}\
    \
    public int getValue(int row, int col) \{\
        return matrix[row][col];\
    \}\
\}\
\
/**\
 * Your SubrectangleQueries object will be instantiated and called as such:\
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);\
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);\
 * int param_2 = obj.getValue(row,col);\
 */}