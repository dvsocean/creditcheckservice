import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url '/credit-scores'
        body """
        {
            "citizenNumber" : 1234
        }
        """
        headers {
            contentType applicationJsonUtf8()
        }
    }

    response {
        status 200
        body """
        {
            "score" : "HIGH"
        }
        """
        headers {
            contentType applicationJsonUtf8()
        }
    }
}