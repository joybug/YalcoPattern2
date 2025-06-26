package behavioral_patterns.iterator.ex02;

import java.util.*;

/**
 * BreadthFirstIterator 클래스는 파일 시스템을 너비 우선(BFS)으로 순회합니다.
 * 큐 자료구조를 사용하여 구현합니다.
 */
class BreadthFirstIterator implements FileSystemIterator {
    /**
     * 순회할 항목을 저장하는 큐입니다.
     */
    private Queue<FileSystemItem> queue = new LinkedList<>();

    /**
     * 생성자: 루트 디렉터리부터 순회를 시작합니다.
     * @param root 루트 디렉터리
     */
    public BreadthFirstIterator(Directory root) {
        queue.offer(root); // 루트 디렉터리를 큐에 추가
    }

    /**
     * 다음 항목이 존재하는지 확인합니다.
     * @return 다음 항목이 있으면 true, 없으면 false
     */
    @Override
    public boolean hasNext() {
        // 큐가 비어있지 않으면 다음 항목이 있음
        return !queue.isEmpty();
    }

    /**
     * 다음 항목을 반환합니다.
     * @return 다음 파일 시스템 항목
     * @throws NoSuchElementException 더 이상 항목이 없을 때 예외 발생
     */
    @Override
    public FileSystemItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        // 큐에서 항목을 꺼냄
        FileSystemItem current = queue.poll();
        // 만약 디렉터리라면, 하위 항목을 모두 큐에 추가
        if (current instanceof Directory) {
            queue.addAll(((Directory) current).getContents());
        }
        return current;
    }
}
