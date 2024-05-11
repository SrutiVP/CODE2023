using namespace std;
int main(){

    int n;
    cout<<"enter a no:";
    cin>>n;
    for(int i=1;i<=n;i++){
        if(n%i==0)
 cout<<i<<endl;
 
    }

int sumOfFactors=0;
sumOfFactors=n;

    if(sumOfFactors==n)
    cout<<" a perfect number "<<sumOfFactors;
    else
    cout<<" not a perfect number "<<sumOfFactors;
    
}