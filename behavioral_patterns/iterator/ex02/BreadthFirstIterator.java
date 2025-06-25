package behavioral_patterns.iterator.ex02;

import java.util.*;

/**
 * BreadthFirstIterator 클래스는 파일 시스템을 너비 우선으로 순회합니다.
 */
class BreadthFirstIterator implements FileSystemIterator {
    private Queue<FileSystemItem> queue = new LinkedList<>();

    public BreadthFirstIterator(Directory root) {
        queue.offer(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public FileSystemItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        FileSystemItem current = queue.poll();
        if (current instanceof Directory) {
            queue.addAll(((Directory) current).getContents());
        }
        return current;
    }
}
