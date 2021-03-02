{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
 * Definition for a binary tree node.\
 * public class TreeNode \{\
 *     int val;\
 *     TreeNode left;\
 *     TreeNode right;\
 *     TreeNode() \{\}\
 *     TreeNode(int val) \{ this.val = val; \}\
 *     TreeNode(int val, TreeNode left, TreeNode right) \{\
 *         this.val = val;\
 *         this.left = left;\
 *         this.right = right;\
 *     \}\
 * \}\
 */\
class Solution \{\
    List<Integer> ans;\
    public boolean findTarget(TreeNode root, int k) \{\
        ans=new ArrayList<>();\
        helper(root);\
        int l=0, r=ans.size()-1;\
        while(l<r)\
        \{\
            int t=ans.get(l)+ans.get(r);\
            if(t==k)\
                return true;\
            else if(t<k)\
                l++;\
            else\
                r--;\
        \}\
        return false;\
    \}\
    \
    private void helper(TreeNode node)\{\
        if(node==null)\
            return;\
        helper(node.left);\
        ans.add(node.val);\
        helper(node.right);\
    \}\
\}}