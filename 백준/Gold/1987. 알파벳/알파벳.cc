#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

char graph[20][20];
bool visited[26];
int r, c, result = 0;
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};

struct Point
{
    int x;
    int y;
    int cnt;
};

void dfs(int x, int y, int cnt)
{
    result = max(result, cnt);
    for (int i = 0; i < 4; i++)
    {
        int nx = dx[i] + x;
        int ny = dy[i] + y;

        if (nx < 0 || nx >= r || ny < 0 || ny >= c)
        {
            continue;
        }

        if (visited[graph[nx][ny] - 'A'] == false)
        {
            visited[graph[nx][ny] - 'A'] = true;
            dfs(nx, ny, cnt + 1);
            visited[graph[nx][ny] - 'A'] = false;
        }
    }
}

int main(void)
{
    cin >> r >> c;

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cin >> graph[i][j];
        }
    }

    visited[graph[0][0] - 'A'] = true;
    dfs(0, 0, 1);

    cout << result << endl;

    return 0;
}