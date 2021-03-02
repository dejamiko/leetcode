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
class FindElements \{\
\
    Set<Integer> ans=new HashSet<>();\
        \
    public FindElements(TreeNode root) \{\
        root.val=0;\
        recover(root);\
    \}\
    \
    public void recover(TreeNode node)\
    \{\
        if(node.left!=null)\
        \{\
            int t=2*node.val+1;\
            node.left.val=t;\
            ans.add(t);\
            recover(node.left);\
        \}\
        if(node.right!=null)\
        \{\
            int t=2*node.val+2;\
            node.right.val=t;\
            ans.add(t);\
            recover(node.right);\
        \}\
    \}\
    \
    public boolean find(int target) \{\
        return ans.contains(target);\
    \}\
\}\
\
/**\
 * Your FindElements object will be instantiated and called as such:\
 * FindElements obj = new FindElements(root);\
 * boolean param_1 = obj.find(target);\
 */}