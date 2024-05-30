package observer;
import java.util.ArrayList;
import java.util.List;

public class GroupAdmin implements Sender{
        private UndoableStringBuilder message;
        private List <Member> members = new ArrayList<Member>();
        @Override
        public void register(Member obj){
            members.add(obj);
        }
        @Override
        public void unregister(Member obj){
            members.remove(obj);
        }

        public void SendMessage (UndoableStringBuilder message){
            this.message = message;
        }
        public void notifyMembers(){
            for (Member temp : members)
                temp.update(message);
        }

        //Inserts the string into this character sequence.
        public void insert(int offset, String obj){
            message.insert(offset,obj);
        }
        // Appends the specified string to this character sequence.
        public void append(String obj){
            message.append(obj);
        }
        // Removes the characters in a substring of this sequence.
        public void delete(int start, int end){
            message.delete(start,end);
        }
        // Erases the last change done to the document, reverting
        // it to an older state.
        public void undo(){
            message.undo();
        }
    }


