package Evernote;

public class MergeList {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
	
	
	public ListNode mergeTwoLists1 (ListNode l1, ListNode l2) {
		
		ListNode h =new ListNode(0);
		ListNode r=h;
		
		while (l1!=null&&l2!=null){
			if (l1.val < l2.val) {
				r.next=l1;
				r=l1;
				l1=l1.next;
			} else {
				r.next=l2;
				r=l2;
				l2=l2.next;
			}
		}
		
		if (l1!=null){ 
				r.next=l1; 
			} else {
				r.next=l2;
			}
		
		
		return h.next;
	}
}
