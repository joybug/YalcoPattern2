package behavioral_patterns.iterator.ex02;

import java.util.*;

/**
 * DepthFirstIterator 클래스는 파일 시스템을 깊이 우선으로 순회합니다.
 */
class DepthFirstIterator implements FileSystemIterator {
    private Stack<FileSystemItem> stack = new Stack<>();

    public DepthFirstIterator(Directory root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public FileSystemItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        FileSystemItem current = stack.pop();
        if (current instanceof Directory) {
            List<FileSystemItem> contents = ((Directory) current).getContents();
            for (int i = contents.size() - 1; i >= 0; i--) {
                stack.push(contents.get(i));
            }
        }
        return current;
    }
}
